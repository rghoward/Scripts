package defpackage;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class z3c extends AbstractMap {
    public Object[] t;
    public int u;
    public Map v;
    public boolean w;
    public volatile y3c x;
    public Map y;

    public void a() {
        if (this.w) {
            return;
        }
        this.v = this.v.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.v);
        this.y = this.y.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.y);
        this.w = true;
    }

    public final w3c b(int i) {
        if (i < this.u) {
            return (w3c) this.t[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final Set c() {
        return this.v.isEmpty() ? Collections.EMPTY_SET : this.v.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        g();
        if (this.u != 0) {
            this.t = null;
            this.u = 0;
        }
        if (this.v.isEmpty()) {
            return;
        }
        this.v.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.v.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        g();
        int iF = f(comparable);
        if (iF >= 0) {
            return ((w3c) this.t[iF]).setValue(obj);
        }
        g();
        if (this.t == null) {
            this.t = new Object[16];
        }
        int i = -(iF + 1);
        if (i >= 16) {
            return h().put(comparable, obj);
        }
        if (this.u == 16) {
            w3c w3cVar = (w3c) this.t[15];
            this.u = 15;
            h().put(w3cVar.t, w3cVar.u);
        }
        Object[] objArr = this.t;
        int length = objArr.length;
        System.arraycopy(objArr, i, objArr, i + 1, 15 - i);
        this.t[i] = new w3c(this, comparable, obj);
        this.u++;
        return null;
    }

    public final Object e(int i) {
        g();
        Object[] objArr = this.t;
        Object obj = ((w3c) objArr[i]).u;
        System.arraycopy(objArr, i + 1, objArr, i, (this.u - i) - 1);
        this.u--;
        if (!this.v.isEmpty()) {
            Iterator it = h().entrySet().iterator();
            Object[] objArr2 = this.t;
            int i2 = this.u;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i2] = new w3c(this, (Comparable) entry.getKey(), entry.getValue());
            this.u++;
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.x == null) {
            this.x = new y3c(this);
        }
        return this.x;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3c)) {
            return super.equals(obj);
        }
        z3c z3cVar = (z3c) obj;
        int size = size();
        if (size == z3cVar.size()) {
            int i = this.u;
            if (i != z3cVar.u) {
                return entrySet().equals(z3cVar.entrySet());
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (b(i2).equals(z3cVar.b(i2))) {
                }
            }
            if (i != size) {
                return this.v.equals(z3cVar.v);
            }
            return true;
        }
        return false;
    }

    public final int f(Comparable comparable) {
        int i = this.u;
        int i2 = i - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int iCompareTo = comparable.compareTo(((w3c) this.t[i2]).t);
            if (iCompareTo > 0) {
                return -(i + 1);
            }
            if (iCompareTo == 0) {
                return i2;
            }
        }
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int iCompareTo2 = comparable.compareTo(((w3c) this.t[i4]).t);
            if (iCompareTo2 < 0) {
                i2 = i4 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i4;
                }
                i3 = i4 + 1;
            }
        }
        return -(i3 + 1);
    }

    public final void g() {
        if (this.w) {
            e44.b();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iF = f(comparable);
        return iF >= 0 ? ((w3c) this.t[iF]).u : this.v.get(comparable);
    }

    public final SortedMap h() {
        g();
        if (this.v.isEmpty() && !(this.v instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.v = treeMap;
            this.y = treeMap.descendingMap();
        }
        return (SortedMap) this.v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.u;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += this.t[i2].hashCode();
        }
        return this.v.size() > 0 ? this.v.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int iF = f(comparable);
        if (iF >= 0) {
            return e(iF);
        }
        if (this.v.isEmpty()) {
            return null;
        }
        return this.v.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.v.size() + this.u;
    }
}
