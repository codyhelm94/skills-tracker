package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("skills")
public class SkillsController {

    //Handle Form Submission
    @GetMapping
    @ResponseBody
    public String helloForm(){
        return "<html>"+
                "<body>"+
                "<h1>Skills Tracker</h1>"+
                "<h2>We have a few skills we would like to learn. Here is the list</h2>"+
                "<ol>"+
                "<li>Java</>"+
                "<li>Python</>"+
                "<li>JavaScript</>"+
                "</body>"+
                "</html>";
    }

    @GetMapping(value="form")
    @ResponseBody
    public String formSkills(){
        String html=
                "<form method='post'>" +
                "<label for='fname'>First Name:</label>"+
                "<input type='text' name='fname' id='fname'>"+
                "<br>My Favorite Language:<br>" +
                "<select name='firstChoice'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'javaScript'>javaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select>" +
                "<br>My Second Favorite Language:<br>" +
                "<select name='secondChoice'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'javaScript'>javaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select>" +
                "<br>My Third Favorite Language:<br>" +
                "<select name='thirdChoice'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'javaScript'>javaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select><br>" +
                "<input type='submit' name='submit' value='Submit'>" +
                "</form>";
        return html;

    }


    @PostMapping(value="form")
    @ResponseBody
    public String namePage(@RequestParam String fname, @RequestParam String firstChoice, @RequestParam String secondChoice, @RequestParam String thirdChoice){
        String html="<h1>"+fname+"</h1>"+
                "<ol>"+
                "<li>"+firstChoice+"</li>"+
                "<li>"+secondChoice+"</li>"+
                "<li>"+thirdChoice+"</li>" +
                "</ol>";

        return html;
    }







}
