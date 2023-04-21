package org.launchcode.skillstracker.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    //at localhost:8080
    //add text states 3 programming languages
    //h1 with the title Skills Tracker
    //h2 and an ol containing three programming languages of your choose

    @GetMapping("")
    public String skills () {
        return"<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }


    //at localhost:8080/form
    //add a form that lets the user enter name and choose
    //favorite, 2nd, and third programming languages
    //use select elements for each rankings, use getmapping()

    @ResponseBody
    @RequestMapping("form")
    public String form() {
        return "<html>" +
                "<body>" +
                "<form method=\"post\">" +
                "<label>Name:</label><br>" +
                "<input type = 'text' name = 'name' ><br>" +
                "<label for=\"firstFavorite\">My Favorite language:</label><br>" +
                "<select name=\"firstFavorite\">" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select><br>" +
                "<label for=\"secondFavorite\">My Second Favorite language:</label><br>" +
                "<select name=\"secondFavorite\">" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select><br>" +
                "<label for=\"thirdFavorite\">My Third Favorite language:</label><br>" +
                "<select name=\"thirdFavorite\">" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select><br>" +
                "<input type = 'submit' value = 'Tell me!' >" +
                "</form>" +
                "</body>" +
                "</html>";
    }



    @PostMapping("/form")
    @ResponseBody
    public String formResponse(@RequestParam String name,
                               @RequestParam String firstFavorite,
                               @RequestParam String secondFavorite,
                               @RequestParam String thirdFavorite  ) {
        return "<h1>" + name + "</h1>" +
                "<ol>" +
                    "<li>" + firstFavorite + "</li>" +
                    "<li>" + secondFavorite + "</li>" +
                    "<li>" + thirdFavorite + "</li>" +
                "</ol>";

    }




}

//at localhost:8080/form
//use postmapping and requestparam to update the html with
//an h1 stating the users name
//and an ol showing the three programming languages in the
//order they chose

