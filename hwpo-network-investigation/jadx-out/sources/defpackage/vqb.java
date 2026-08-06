package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vqb {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Code duplicated, block: B:23:0x005f  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:29:0x008b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0090  */
    public static final qqb a(v0 v0Var, et1 et1Var, fr1 fr1Var) {
        cm cmVar;
        qqb qqbVar;
        int i = 1;
        if (hn4.a.compareAndSet(false, true)) {
            zx0 zx0VarA = da1.a(1, 6, null);
            oy0.d(u72.a((h72) ss.F.getValue()), null, null, new gn4(zx0VarA, null), 3);
            oh3 oh3Var = new oh3(i, zx0VarA);
            synchronized (qu9.c) {
                qu9.i = th1.L(qu9.i, oh3Var);
                g2b g2bVar = g2b.a;
            }
            qu9.a();
        }
        if (v0Var.getChildCount() > 0) {
            View childAt = v0Var.getChildAt(0);
            cmVar = childAt instanceof cm ? (cm) childAt : null;
            if (cmVar != null) {
                cmVar.setComposeViewContext(et1Var);
            }
            if (cmVar == null) {
                cmVar = new cm(v0Var.getContext(), et1Var);
                v0Var.addView(cmVar.getView(), a);
            }
            cmVar.setComposeViewContext(et1Var);
            if (v0Var.getComposeViewContext$ui() != null) {
                et1Var.c();
                cmVar.setComposeViewContextIncrementedDuringInit$ui(true);
            }
            Object tag = cmVar.getTag(R.id.wrapped_composition_tag);
            qqbVar = tag instanceof qqb ? (qqb) tag : null;
            if (qqbVar == null) {
                qqbVar = new qqb(cmVar, new gu1(et1Var.b, new j1b(cmVar.getRoot())));
                cmVar.setTag(R.id.wrapped_composition_tag, qqbVar);
            }
            qqbVar.l(fr1Var);
            cmVar.setFrameEndScheduler$ui(new uqb(et1Var.b));
            return qqbVar;
        }
        v0Var.removeAllViews();
        cmVar = null;
        if (cmVar == null) {
            cmVar = new cm(v0Var.getContext(), et1Var);
            v0Var.addView(cmVar.getView(), a);
        }
        cmVar.setComposeViewContext(et1Var);
        if (v0Var.getComposeViewContext$ui() != null) {
            et1Var.c();
            cmVar.setComposeViewContextIncrementedDuringInit$ui(true);
        }
        Object tag2 = cmVar.getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof qqb) {
        }
        if (qqbVar == null) {
            qqbVar = new qqb(cmVar, new gu1(et1Var.b, new j1b(cmVar.getRoot())));
            cmVar.setTag(R.id.wrapped_composition_tag, qqbVar);
        }
        qqbVar.l(fr1Var);
        cmVar.setFrameEndScheduler$ui(new uqb(et1Var.b));
        return qqbVar;
    }
}
