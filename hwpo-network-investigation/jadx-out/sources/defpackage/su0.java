package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import com.hwpo_training_app.core.widget.ChooseTimeEditText;
import com.intercom.twig.BuildConfig;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class su0 implements ru0, jac {
    public static final su0 t = new su0();
    public static final /* synthetic */ su0 u = new su0();

    public static final void c(ChooseTimeEditText chooseTimeEditText, oh4 oh4Var) {
        el8 el8Var = new el8();
        gl8 gl8Var = new gl8();
        gl8Var.t = BuildConfig.FLAVOR;
        chooseTimeEditText.addTextChangedListener(new qoa(el8Var, gl8Var, chooseTimeEditText, oh4Var));
    }

    public static int d(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    public static int e(Object obj) {
        return d(obj == null ? 0 : obj.hashCode());
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return Long.valueOf(u4c.u.get().a0());
    }

    @Override // defpackage.ru0
    public Rect b(Activity activity) {
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!activity.isInMultiWindowMode()) {
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i = rect.bottom + dimensionPixelSize;
            if (i == point.y) {
                rect.bottom = i;
                return rect;
            }
            int i2 = rect.right + dimensionPixelSize;
            if (i2 == point.x) {
                rect.right = i2;
            }
        }
        return rect;
    }
}
