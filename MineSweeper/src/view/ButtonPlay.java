package view;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JButton;

public class ButtonPlay extends JButton {

    private static final long serialVersionUID = 1L;
    private int number;
    private PanelPlayer p;
    private int row;
    private int col;
    private boolean isBoom;
    private boolean isOpen;
    private boolean isCamCo;
    private int countBoomAround;
    private int undoState;

    
    public ButtonPlay(PanelPlayer p) {
        number = -1;
        undoState = -1;
        this.p = p;
        setPreferredSize(new Dimension(30, 30));
    }

    // Copy constructor
    public ButtonPlay(ButtonPlay other) {
        super(other.getText());
        this.row = other.row;
        this.col = other.col;
        this.isBoom = other.isBoom;
        this.isOpen = other.isOpen;
        this.isCamCo = other.isCamCo;
        this.countBoomAround = other.countBoomAround;
        this.undoState = other.undoState;
    }

    @Override
    public void paint(Graphics g) {
        switch (number) {

        case -1:
            g.drawImage(p.getGame().getGameFrame().getLoadData().getListImage().get("noUse"), 0, 0,
                    getPreferredSize().width, getPreferredSize().height, null);
            break;

        case 0:
            g.drawImage(p.getGame().getGameFrame().getLoadData().getListImage().get("b0"), 0, 0,
                    getPreferredSize().width, getPreferredSize().height, null);
            break;

        case 1:
            g.drawImage(p.getGame().getGameFrame().getLoadData().getListImage().get("b1"), 0, 0,
                    getPreferredSize().width, getPreferredSize().height, null);
            break;

        case 2:
            g.drawImage(p.getGame().getGameFrame().getLoadData().getListImage().get("b2"), 0, 0,
                    getPreferredSize().width, getPreferredSize().height, null);
            break;

        case 3:
            g.drawImage(p.getGame().getGameFrame().getLoadData().getListImage().get("b3"), 0, 0,
                    getPreferredSize().width, getPreferredSize().height, null);
            break;

        case 4:
            g.drawImage(p.getGame().getGameFrame().getLoadData().getListImage().get("b4"), 0, 0,
                    getPreferredSize().width, getPreferredSize().height, null);
            break;

        case 5:
            g.drawImage(p.getGame().getGameFrame().getLoadData().getListImage().get("b5"), 0, 0,
                    getPreferredSize().width, getPreferredSize().height, null);
            break;

        case 6:
            g.drawImage(p.getGame().getGameFrame().getLoadData().getListImage().get("b6"), 0, 0,
                    getPreferredSize().width, getPreferredSize().height, null);
            break;

        case 7:
            g.drawImage(p.getGame().getGameFrame().getLoadData().getListImage().get("b7"), 0, 0,
                    getPreferredSize().width, getPreferredSize().height, null);
            break;

        case 8:
            g.drawImage(p.getGame().getGameFrame().getLoadData().getListImage().get("b8"), 0, 0,
                    getPreferredSize().width, getPreferredSize().height, null);
            break;
        case 9:
            g.drawImage(p.getGame().getGameFrame().getLoadData().getListImage().get("co"), 0, 0,
                    getPreferredSize().width, getPreferredSize().height, null);
            break;
        case 10:
            g.drawImage(p.getGame().getGameFrame().getLoadData().getListImage().get("boom"), 0, 0,
                    getPreferredSize().width, getPreferredSize().height, null);
            break;
        case 11:
            g.drawImage(p.getGame().getGameFrame().getLoadData().getListImage().get("boomRed"), 0, 0,
                    getPreferredSize().width, getPreferredSize().height, null);
            break;
        case 12:
            g.drawImage(p.getGame().getGameFrame().getLoadData().getListImage().get("boomX"), 0, 0,
                    getPreferredSize().width, getPreferredSize().height, null);
            break;
        default:
            break;
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.undoState = this.number;
        this.number = number;
    }

    public int getUndoState() {
        return undoState;
    }

    // Getters and setters omitted for brevity
}