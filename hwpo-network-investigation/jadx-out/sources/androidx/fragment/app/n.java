package androidx.fragment.app;

import android.util.Log;
import defpackage.mhb;
import defpackage.thb;
import defpackage.vhb;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends mhb {
    public static final a z = new a();
    public final boolean w;
    public final HashMap<String, f> t = new HashMap<>();
    public final HashMap<String, n> u = new HashMap<>();
    public final HashMap<String, vhb> v = new HashMap<>();
    public boolean x = false;
    public boolean y = false;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements thb.c {
        @Override // thb.c
        public final <T extends mhb> T create(Class<T> cls) {
            return new n(true);
        }
    }

    public n(boolean z2) {
        this.w = z2;
    }

    public final void b(f fVar) {
        if (this.y) {
            if (l.M(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        String str = fVar.mWho;
        HashMap<String, f> map = this.t;
        if (map.containsKey(str)) {
            return;
        }
        map.put(fVar.mWho, fVar);
        if (l.M(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + fVar);
        }
    }

    public final void c(f fVar, boolean z2) {
        if (l.M(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fVar);
        }
        e(fVar.mWho, z2);
    }

    public final void d(String str, boolean z2) {
        if (l.M(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        e(str, z2);
    }

    public final void e(String str, boolean z2) {
        HashMap<String, n> map = this.u;
        n nVar = map.get(str);
        if (nVar != null) {
            if (z2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(nVar.u.keySet());
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    nVar.d((String) obj, true);
                }
            }
            nVar.onCleared();
            map.remove(str);
        }
        HashMap<String, vhb> map2 = this.v;
        vhb vhbVar = map2.get(str);
        if (vhbVar != null) {
            vhbVar.a();
            map2.remove(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (this.t.equals(nVar.t) && this.u.equals(nVar.u) && this.v.equals(nVar.v)) {
                return true;
            }
        }
        return false;
    }

    public final void f(f fVar) {
        if (this.y) {
            if (l.M(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.t.remove(fVar.mWho) == null || !l.M(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fVar);
        }
    }

    public final int hashCode() {
        return this.v.hashCode() + ((this.u.hashCode() + (this.t.hashCode() * 31)) * 31);
    }

    @Override // defpackage.mhb
    public final void onCleared() {
        if (l.M(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.x = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<f> it = this.t.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.u.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.v.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
