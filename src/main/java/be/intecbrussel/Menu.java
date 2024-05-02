package be.intecbrussel;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Data
@Entity
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double price;
    private boolean paid;
    private boolean vegetarian;

    @ManyToMany(mappedBy = "menus")
    private List<Customer> customers = new ArrayList<>();

}
