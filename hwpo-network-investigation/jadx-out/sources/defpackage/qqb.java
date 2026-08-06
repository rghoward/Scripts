package defpackage;

import android.os.Looper;
import android.view.View;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qqb implements xt1, g76 {
    public final cm t;
    public final gu1 u;
    public boolean v;
    public s66 w;
    public ci4<? super jt1, ? super Integer, g2b> x = ds1.a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements oh4<et1, g2b> {
        public final /* synthetic */ ci4<jt1, Integer, g2b> v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(ci4<? super jt1, ? super Integer, g2b> ci4Var) {
            super(1);
            this.v = ci4Var;
        }

        @Override // defpackage.oh4
        public final g2b invoke(et1 et1Var) {
            et1 et1Var2 = et1Var;
            qqb qqbVar = qqb.this;
            if (!qqbVar.v) {
                m76 m76Var = et1Var2.c;
                View view = et1Var2.a;
                s66 lifecycle = m76Var.getLifecycle();
                ci4<jt1, Integer, g2b> ci4Var = this.v;
                qqbVar.x = ci4Var;
                int i = 1;
                if (qqbVar.w == null) {
                    if (xj5.a(Looper.myLooper(), view.getHandler().getLooper())) {
                        qqbVar.w = lifecycle;
                        lifecycle.a(qqbVar);
                    } else {
                        view.post(new p59(i, qqbVar, lifecycle));
                    }
                } else if (lifecycle.b().compareTo(s66.b.v) >= 0) {
                    qqbVar.u.l(new fr1(true, -1723985096, new pqb(qqbVar, et1Var2, ci4Var)));
                }
            }
            return g2b.a;
        }
    }

    public qqb(cm cmVar, gu1 gu1Var) {
        this.t = cmVar;
        this.u = gu1Var;
    }

    @Override // defpackage.xt1
    public final void dispose() {
        if (!this.v) {
            this.v = true;
            this.t.getView().setTag(R.id.wrapped_composition_tag, null);
            s66 s66Var = this.w;
            if (s66Var != null) {
                s66Var.c(this);
            }
            this.w = null;
        }
        this.u.dispose();
    }

    @Override // defpackage.xt1
    public final void l(ci4<? super jt1, ? super Integer, g2b> ci4Var) {
        this.t.setOnReadyForComposition(new a(ci4Var));
    }

    @Override // defpackage.g76
    public final void t(m76 m76Var, s66.a aVar) {
        if (aVar == s66.a.ON_DESTROY) {
            dispose();
        } else {
            if (aVar != s66.a.ON_CREATE || this.v) {
                return;
            }
            l(this.x);
        }
    }
}
