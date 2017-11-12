package app.models;

import app.user.User;

import java.time.Instant;
import java.util.Date;

public class Ticket {
    private int id;
    private String name;
    private String type;
    private String description;
    private String status;
    private User createdBy;
    private Room room;
    private Date createdOn;
    private Date modifiedOn;

    public Ticket(String name, String type, String status, int createdById, int roomId)
    {
        this(0,name,type,status,new User(createdById),new Room(roomId),Date.from(Instant.now()), Date.from(Instant.now()));
    }

    public Ticket(int id, String name, String type, String status, User createdBy, Room room, Date createdOn, Date modifiedOn) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.status = status;
        this.createdBy = createdBy;
        this.room = room;
        this.createdOn = createdOn;
        this.modifiedOn = modifiedOn;
    }

    public int getId()
    {
        return this.id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getType()
    {
        return this.type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getDescription()
    {
        return this.description;
    }

    public void setDescription(String desc)
    {
        this.description = desc;
    }

    public String getStatus()
    {
        return this.status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public User getCreatedBy()
    {
        return this.createdBy;
    }

    public void setCreatedBy(User createdBy)
    {
        this.createdBy = createdBy;
    }

    public Room getRoom()
    {
        return this.room;
    }

    public void setRoom(Room room)
    {
        this.room = room;
    }

    public Date getCreatedOn()
    {
        return this.createdOn;
    }

    public void setCreatedOn(Date createdOn)
    {
        this.createdOn = createdOn;
    }

    public Date getModifiedOn()
    {
        return this.modifiedOn;
    }

    public void setModifiedOn(Date modifiedOn)
    {
        this.modifiedOn = modifiedOn;
    }
}