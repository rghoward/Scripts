package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tnb implements qnb {
    public static final tnb a = new tnb();

    @Override // defpackage.qnb
    public final nnb a(Context context, ux2 ux2Var) {
        ru0 ru0Var;
        ux2Var.getClass();
        Context baseContext = context;
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                baseContext = context;
                break;
            }
            if ((baseContext instanceof Activity) || (baseContext instanceof InputMethodService)) {
                break;
            }
            ContextWrapper contextWrapper = (ContextWrapper) baseContext;
            if (contextWrapper.getBaseContext() == null) {
                break;
            }
            baseContext = contextWrapper.getBaseContext();
            baseContext.getClass();
        }
        if (baseContext instanceof Activity) {
            Activity activity = (Activity) baseContext;
            ux2Var.getClass();
            ru0.a.getClass();
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                ru0Var = vu0.t;
            } else if (i >= 29) {
                ru0Var = uu0.t;
            } else {
                ru0Var = i >= 28 ? tu0.t : su0.t;
            }
            return new nnb(new qu0(ru0Var.b(activity)), ux2Var.b(activity));
        }
        if (!(baseContext instanceof InputMethodService) && !(baseContext instanceof Application)) {
            z90.a("Must provide a UiContext or Application Context");
            return null;
        }
        Object systemService = context.getSystemService("window");
        systemService.getClass();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        defaultDisplay.getClass();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new nnb(new Rect(0, 0, point.x, point.y), ux2Var.b(context));
    }
}
