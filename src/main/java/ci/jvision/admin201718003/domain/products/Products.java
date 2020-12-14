package ci.jvision.admin201718003.domain.products;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Products {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column( nullable = false)
    private Long p_id;

    @Column(nullable = false)
    private String p_name;

    @Column(nullable = false)
    private Long p_price;

    @Column(length = 500,nullable = false)
    private String p_desc;

    @Builder
    public Products(String p_name, Long p_price, String p_desc)
    {
        this.p_name = p_name;
        this.p_price = p_price;
        this.p_desc = p_desc;
    }

}
