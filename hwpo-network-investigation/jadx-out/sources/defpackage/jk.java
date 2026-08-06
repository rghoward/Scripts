package defpackage;

import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jk implements ff0 {
    public final cm a;
    public final qf0 b;
    public final AutofillManager c;
    public final AutofillId d;

    public jk(cm cmVar, qf0 qf0Var) {
        this.a = cmVar;
        this.b = qf0Var;
        AutofillManager autofillManager = (AutofillManager) cmVar.getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            aa0.c("Autofill service could not be located.");
            throw null;
        }
        this.c = autofillManager;
        cmVar.setImportantForAutofill(1);
        nf0 nf0VarA = fgb.a(cmVar);
        AutofillId autofillId = nf0VarA != null ? (AutofillId) nf0VarA.a : null;
        if (autofillId == null) {
            throw ik.a("Required value was null.");
        }
        this.d = autofillId;
    }
}
