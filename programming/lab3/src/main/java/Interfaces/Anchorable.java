package Interfaces;

import Errors.AnchorException;

public interface Anchorable {
    String anchor() throws AnchorException;
    String unanchor() throws  AnchorException;
}
