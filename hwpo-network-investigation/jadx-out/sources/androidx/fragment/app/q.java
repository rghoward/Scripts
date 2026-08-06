package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import defpackage.p51;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class q {
    public final ArrayList<f> a = new ArrayList<>();
    public final HashMap<String, p> b = new HashMap<>();
    public final HashMap<String, Bundle> c = new HashMap<>();
    public n d;

    public final void a(f fVar) {
        if (this.a.contains(fVar)) {
            p51.c(fVar, "Fragment already added: ");
            return;
        }
        synchronized (this.a) {
            this.a.add(fVar);
        }
        fVar.mAdded = true;
    }

    public final f b(String str) {
        p pVar = this.b.get(str);
        if (pVar != null) {
            return pVar.c;
        }
        return null;
    }

    public final f c(String str) {
        f fVarFindFragmentByWho;
        for (p pVar : this.b.values()) {
            if (pVar != null && (fVarFindFragmentByWho = pVar.c.findFragmentByWho(str)) != null) {
                return fVarFindFragmentByWho;
            }
        }
        return null;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (p pVar : this.b.values()) {
            if (pVar != null) {
                arrayList.add(pVar);
            }
        }
        return arrayList;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (p pVar : this.b.values()) {
            if (pVar != null) {
                arrayList.add(pVar.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List<f> f() {
        ArrayList arrayList;
        if (this.a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    public final void g(p pVar) {
        f fVar = pVar.c;
        String str = fVar.mWho;
        HashMap<String, p> map = this.b;
        if (map.get(str) != null) {
            return;
        }
        map.put(fVar.mWho, pVar);
        if (fVar.mRetainInstanceChangedWhileDetached) {
            boolean z = fVar.mRetainInstance;
            n nVar = this.d;
            if (z) {
                nVar.b(fVar);
            } else {
                nVar.f(fVar);
            }
            fVar.mRetainInstanceChangedWhileDetached = false;
        }
        if (l.M(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fVar);
        }
    }

    public final void h(p pVar) {
        f fVar = pVar.c;
        if (fVar.mRetainInstance) {
            this.d.f(fVar);
        }
        String str = fVar.mWho;
        HashMap<String, p> map = this.b;
        if (map.get(str) == pVar && map.put(fVar.mWho, null) != null && l.M(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fVar);
        }
    }

    public final Bundle i(Bundle bundle, String str) {
        HashMap<String, Bundle> map = this.c;
        return bundle != null ? map.put(str, bundle) : map.remove(str);
    }
}
