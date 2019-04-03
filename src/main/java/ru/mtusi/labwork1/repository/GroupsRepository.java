package ru.mtusi.labwork1.repository;

import ru.mtusi.labwork1.model.Group;

public class GroupsRepository extends AbstractRepository<Group> {
    public GroupsRepository() {
        super(Group.class);
    }
}
