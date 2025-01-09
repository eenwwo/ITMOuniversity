package Entities;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<Character> members;
    private String groupName;

    public Group(String groupName) {
        this.groupName = groupName;
        this.members = new ArrayList<>();
    }

    public void addMember(Character member) {
        members.add(member);
    }

    public String performActions() {
        return ("Действия группы " + groupName + ":" + "\n");
    }

    public List<Character> getMembers() {
        return members;
    }

    public String getGroupName() {
        return groupName;
    }

    public int size() {
        return members.size();
    }
}
