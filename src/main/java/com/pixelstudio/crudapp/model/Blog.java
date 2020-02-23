package com.pixelstudio.crudapp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "blog")
public class Blog extends Auditable {
    @Getter
    @Setter
    private Long userid;

    @Getter
    @Setter
    @NotBlank
    private String title;

    @Getter
    @Setter
    @NotBlank
    private String content;

    @Override
    public String toString() {
        return "Blog{" +
                "userid=" + userid +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
