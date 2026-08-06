package defpackage;

import android.util.SparseArray;
import android.view.autofill.AutofillValue;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ok {
    public static final void a(jk jkVar, SparseArray<AutofillValue> sparseArray) {
        if (jkVar.b.a.isEmpty()) {
            return;
        }
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = sparseArray.keyAt(i);
            AutofillValue autofillValueB = kk.b(sparseArray.get(iKeyAt));
            if (autofillValueB.isText()) {
                qf0 qf0Var = jkVar.b;
                autofillValueB.getTextValue().toString();
            } else {
                if (autofillValueB.isDate()) {
                    throw new lc7("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (autofillValueB.isList()) {
                    throw new lc7("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (autofillValueB.isToggle()) {
                    throw new lc7("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }
}
