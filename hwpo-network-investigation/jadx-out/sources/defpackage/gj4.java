package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gj4 {
    public ArrayList<Object> a;

    public final ArrayList<Object> a() {
        return this.a;
    }

    public final int b() {
        return 0;
    }

    public final String c() {
        return null;
    }

    public final boolean d(vi4 vi4Var) {
        ArrayList<Object> arrayList = this.a;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                Object obj = arrayList.get(i);
                if (xj5.a(obj, vi4Var)) {
                    return true;
                }
                if ((obj instanceof gj4) && ((gj4) obj).d(vi4Var)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final gj4 e() {
        Object obj;
        ArrayList<Object> arrayList = this.a;
        if (arrayList == null) {
            obj = null;
            break;
        }
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                obj = null;
                break;
            }
            obj = arrayList.get(size);
            if (obj instanceof gj4) {
                break;
            }
            size--;
        }
        gj4 gj4Var = obj instanceof gj4 ? (gj4) obj : null;
        return gj4Var != null ? gj4Var.e() : this;
    }

    public final boolean f(vi4 vi4Var) {
        ArrayList<Object> arrayList = this.a;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Object obj = arrayList.get(size);
                if (obj instanceof vi4) {
                    if (obj == vi4Var) {
                        arrayList.remove(size);
                    }
                } else if ((obj instanceof gj4) && !((gj4) obj).f(vi4Var)) {
                    arrayList.remove(size);
                }
            }
            if (arrayList.isEmpty()) {
                this.a = null;
                return false;
            }
        }
        return true;
    }
}
