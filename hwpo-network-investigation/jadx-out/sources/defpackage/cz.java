package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cz implements Runnable {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ cz(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0077  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        bd6 bd6Var;
        Object systemService;
        Context contextF;
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                Context context = (Context) obj;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 33) {
                    ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i2 >= 33) {
                            r30<WeakReference<dz>> r30Var = dz.z;
                            r30Var.getClass();
                            r30.a aVar = new r30.a();
                            while (true) {
                                if (aVar.hasNext()) {
                                    dz dzVar = (dz) ((WeakReference) aVar.next()).get();
                                    if (dzVar != null && (contextF = dzVar.f()) != null) {
                                        systemService = contextF.getSystemService("locale");
                                    }
                                } else {
                                    systemService = null;
                                }
                            }
                            if (systemService != null) {
                                bd6Var = new bd6(new dd6(dz.b.a(systemService)));
                            } else {
                                bd6Var = bd6.b;
                            }
                        } else {
                            bd6Var = dz.v;
                            if (bd6Var == null) {
                                bd6Var = bd6.b;
                            }
                        }
                        if (bd6Var.a.a.isEmpty()) {
                            String strF = x10.f(context);
                            Object systemService2 = context.getSystemService("locale");
                            if (systemService2 != null) {
                                dz.b.b(systemService2, dz.a.a(strF));
                            }
                        }
                        context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
                dz.y = true;
                break;
            default:
                View view = (View) obj;
                ((InputMethodManager) view.getContext().getSystemService(InputMethodManager.class)).showSoftInput(view, 1);
                break;
        }
    }
}
