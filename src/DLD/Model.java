package DLD;


import raven.menu.mode.LightDarkMode;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.ui.FlatUIUtils;
import com.formdev.flatlaf.util.UIScale;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.List;
import raven.menu.mode.ToolBarAccentColor;

/**
 *
 * @author Raven
 */
public class Model{
   ArrayList<Integer> arr;
   int total;
   Model(ArrayList<Integer> arr, int total){
      this.arr = arr;
      this.total=total;
   }
   Model(){}

}
