package Interfaces;

import Enums.Location;
import Errors.AnchorException;

public interface Movable {
    String move(Location location) throws AnchorException;
}
