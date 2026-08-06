package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.inputmethodservice.InputMethodService;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ft1 extends wp5 implements mh4<ky2> {
    public final /* synthetic */ et1 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ft1(et1 et1Var) {
        super(0);
        this.u = et1Var;
    }

    @Override // defpackage.mh4
    public final ky2 invoke() {
        boolean zB = kg5.b(0L, 0L);
        View view = this.u.a;
        if (!zB) {
            return new ky2(0L, u7d.f(view.getContext()).P(c43.c(0L)));
        }
        Context context = view.getContext();
        Context baseContext = context;
        while (true) {
            if (baseContext instanceof ContextWrapper) {
                if ((baseContext instanceof Activity) || (baseContext instanceof InputMethodService) || (baseContext instanceof Application)) {
                    break;
                }
                ContextWrapper contextWrapper = (ContextWrapper) baseContext;
                if (contextWrapper.getBaseContext() != null) {
                    baseContext = contextWrapper.getBaseContext();
                }
            }
            baseContext = null;
            break;
        }
        if (baseContext == null) {
            Configuration configuration = context.getResources().getConfiguration();
            zx2 zx2VarF = u7d.f(context);
            long jA = a53.a(configuration.screenWidthDp, configuration.screenHeightDp);
            long jZ1 = zx2VarF.z1(jA);
            return new ky2((((long) ((int) Float.intBitsToFloat((int) (jZ1 & 4294967295L)))) & 4294967295L) | (((long) ((int) Float.intBitsToFloat((int) (jZ1 >> 32)))) << 32), jA);
        }
        onb.a.getClass();
        onb.a aVar = onb.a.a;
        pnb pnbVar = onb.a.b;
        pnbVar.getClass();
        nnb nnbVarA = pnbVar.a(baseContext);
        long jHeight = (4294967295L & ((long) nnbVarA.a().height())) | (((long) nnbVarA.a().width()) << 32);
        return new ky2(jHeight, u7d.f(baseContext).P(c43.c(jHeight)));
    }
}
