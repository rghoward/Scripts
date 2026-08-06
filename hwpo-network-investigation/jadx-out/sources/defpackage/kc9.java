package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kc9 {
    public static final ria a(lb9 lb9Var) {
        oh4 oh4Var;
        ArrayList arrayList = new ArrayList();
        Object objD = lb9Var.t.d(kb9.a);
        if (objD == null) {
            objD = null;
        }
        k3 k3Var = (k3) objD;
        if (k3Var == null || (oh4Var = (oh4) k3Var.b) == null || !((Boolean) oh4Var.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (ria) arrayList.get(0);
    }

    public static final bt b(kt ktVar, int i) {
        Object next;
        Iterator<T> it = ktVar.getLayoutNodeToHolder().entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((qr5) ((Map.Entry) next).getKey()).u != i);
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (bt) entry.getValue();
        }
        return null;
    }

    public static final String c(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            return "android.widget.ImageView";
        }
        if (i == 6) {
            return "android.widget.Spinner";
        }
        if (i == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }
}
