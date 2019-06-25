package Controller;

import Config.Conexion;
import Entidad.Personas;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controlador {

    Conexion con = new Conexion();
    JdbcTemplate jdbcTemplate = new JdbcTemplate(con.Conectar());

    ModelAndView mav = new ModelAndView();
    int id;
    List datos;

    @RequestMapping("home.htm")
    public ModelAndView Listar() {
        String sql = "select * from personas";
        datos = this.jdbcTemplate.queryForList(sql);
        mav.addObject("lista", datos);
        mav.setViewName("home");
        return mav;
    }

    @RequestMapping(value = "agregar.htm", method = RequestMethod.GET)
    public ModelAndView Agregar() {
        mav.addObject(new Personas());
        mav.setViewName("agregar");
        return mav;
    }

    @RequestMapping(value = "agregar.htm", method = RequestMethod.POST)
    public ModelAndView Agregar(Personas p) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        
        String sql = "insert into personas(perNombre, perApellido, perFechaNacimiento, perTipoDocumento, perNumeroDocumento)values(?,?,?,?,?)";
        this.jdbcTemplate.update(sql, p.getPerNombre(), p.getPerApellido(), p.getPerFechaNacimiento(), p.getPerTipoDocumento(), p.getPerNumeroDocumento());
        return new ModelAndView("redirect:/home.htm");
    }
    
    @RequestMapping(value = "editar.htm", method = RequestMethod.GET)
    public ModelAndView Editar(HttpServletRequest request){
        id= Integer.parseInt(request.getParameter("id"));        
        String sql="select * from personas where Id="+id;
        datos = this.jdbcTemplate.queryForList(sql);
        mav.addObject("lista", datos);
        mav.setViewName("editar");
        return mav;
    }
    
    @RequestMapping(value = "editar.htm", method = RequestMethod.POST)
    public ModelAndView Editar(Personas p) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");        
        String sql = "update personas set perNombre=?,perApellido=?,perFechaNacimiento=?,perTipoDocumento=?,perNumeroDocumento=? where Id=?";
        this.jdbcTemplate.update(sql, p.getPerNombre(), p.getPerApellido(), p.getPerFechaNacimiento(), p.getPerTipoDocumento(), p.getPerNumeroDocumento(),id);
        return new ModelAndView("redirect:/home.htm");
    }
    
    @RequestMapping(value = "delete.htm", method = RequestMethod.GET)
    public ModelAndView Delete(HttpServletRequest request){
        id= Integer.parseInt(request.getParameter("id"));        
        String sql="delete from personas where Id="+id;
        this.jdbcTemplate.update(sql);
        return new ModelAndView("redirect:/home.htm");
    }
}
