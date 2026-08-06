package defpackage;

import android.view.View;
import androidx.fragment.app.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kg4 {
    public static final lg4 a = new lg4();
    public static final og4 b;

    static {
        og4 og4Var = null;
        try {
            og4Var = (og4) qg4.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = og4Var;
    }

    public static final void a(f fVar, f fVar2, boolean z, n30 n30Var) {
        fVar.getClass();
        fVar2.getClass();
        n30Var.getClass();
        if ((z ? fVar2.getEnterTransitionCallback() : fVar.getEnterTransitionCallback()) != null) {
            ArrayList arrayList = new ArrayList(n30Var.v);
            Iterator it = ((n30.a) n30Var.entrySet()).iterator();
            while (it.hasNext()) {
                arrayList.add((View) ((Map.Entry) it.next()).getValue());
            }
            ArrayList arrayList2 = new ArrayList(n30Var.v);
            Iterator it2 = ((n30.a) n30Var.entrySet()).iterator();
            while (it2.hasNext()) {
                arrayList2.add((String) ((Map.Entry) it2.next()).getKey());
            }
        }
    }

    public static final String b(n30<String, String> n30Var, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : (n30.a) n30Var.entrySet()) {
            if (xj5.a(entry.getValue(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        return (String) th1.A(arrayList);
    }

    public static final void c(int i, ArrayList arrayList) {
        arrayList.getClass();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((View) obj).setVisibility(i);
        }
    }
}
