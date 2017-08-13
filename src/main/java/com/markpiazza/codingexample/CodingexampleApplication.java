package com.markpiazza.codingexample;

import com.markpiazza.codingexample.model.ToDoItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@SpringBootApplication
@RestController
public class CodingexampleApplication {

    private static Logger log = LoggerFactory.getLogger(CodingexampleApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(CodingexampleApplication.class, args);
    }

    private volatile List<ToDoItem> toDoItems;

    public CodingexampleApplication() {
        // Prime the data store with a few entries for testing
        // TODO: remove me
        toDoItems = new LinkedList<>();
        toDoItems.add(new ToDoItem("My first title item", "Some description", 0L));
        toDoItems.add(new ToDoItem("My second title item", "Some description", 1L));
    }


    /**
     * Friendly message
     *
     * @return html
     */
    @RequestMapping("/")
    public ResponseEntity<String> index() {
        return new ResponseEntity<>(
                "<html><body>Please navigate to /toDoItem</body></html>", HttpStatus.OK);
    }


    /**
     * Get all todoitems
     *
     * @return all todo items
     */
    @RequestMapping(value = "/toDoItem", method = RequestMethod.GET)
    public ResponseEntity<List<ToDoItem>> getAllToDoItems() {
        return new ResponseEntity<>(toDoItems, HttpStatus.OK);
    }

    /**
     * Get one todoitem
     * TODO: Get item by actual id
     *
     * @return todo item
     */
    @RequestMapping(value = "/toDoItem/{item}", method = RequestMethod.GET)
    public ResponseEntity<ToDoItem> getToDoItem(@PathVariable(value = "item") String item) {
        int index;
        try {
            index = Integer.parseInt(item);
        } catch (NullPointerException e) {
            log.error("item index was null", e);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } catch (NumberFormatException e) {
            log.error("unable to parse item index",e);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(toDoItems.get(index), HttpStatus.OK);
    }

    /**
     * Add a new “To Do Item” using a POST
     * TODO: Implement
     *
     * @param toDoItem json object
     * @return null
     */
    @RequestMapping(value = "/toDoItem", method = RequestMethod.POST)
    public ResponseEntity<String> addToDoItem(@RequestBody ToDoItem toDoItem) {
        // TODO: Update persistance layer
        log.warn("todo item post not implimented");
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    /**
     * Update an existing “To Do Item” using a Patch
     * TODO: Implement
     *
     * @param item todo index
     * @param toDoItem json objet
     * @return null
     */
    @RequestMapping(value = "/toDoItem/{item}", method = RequestMethod.PATCH)
    public ResponseEntity<String> updateToDoItem(@PathVariable(value = "item") String item, @RequestBody ToDoItem toDoItem) {
        log.warn("todo item patch not implimented");
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}


