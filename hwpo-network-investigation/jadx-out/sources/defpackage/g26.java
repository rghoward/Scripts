package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class g26 extends m2<String> implements h26, RandomAccess {
    public final List<Object> u;

    static {
        new g26();
    }

    public g26() {
        super(false);
        this.u = Collections.EMPTY_LIST;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        d();
        this.u.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.m2, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        d();
        if (collection instanceof h26) {
            collection = ((h26) collection).m();
        }
        boolean zAddAll = this.u.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // defpackage.m2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        d();
        this.u.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.h26
    public final void e0(f01 f01Var) {
        d();
        this.u.add(f01Var);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        List<Object> list = this.u;
        Object obj = list.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof f01) {
            f01 f01Var = (f01) obj;
            String strL = f01Var.size() == 0 ? BuildConfig.FLAVOR : f01Var.l(zi5.a);
            if (f01Var.i()) {
                list.set(i, strL);
            }
            return strL;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, zi5.a);
        if (h6b.a.b(bArr, 0, bArr.length) == 0) {
            list.set(i, str);
        }
        return str;
    }

    @Override // zi5.c
    public final zi5.c h(int i) {
        List<Object> list = this.u;
        if (i < list.size()) {
            zn3.b();
            return null;
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(list);
        return new g26((ArrayList<Object>) arrayList);
    }

    @Override // defpackage.h26
    public final List<?> m() {
        return Collections.unmodifiableList(this.u);
    }

    @Override // defpackage.h26
    public final h26 m0() {
        return this.t ? new x2b(this) : this;
    }

    @Override // defpackage.h26
    public final Object r0(int i) {
        return this.u.get(i);
    }

    @Override // defpackage.m2, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        d();
        Object objRemove = this.u.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof f01)) {
            return new String((byte[]) objRemove, zi5.a);
        }
        f01 f01Var = (f01) objRemove;
        return f01Var.size() == 0 ? BuildConfig.FLAVOR : f01Var.l(zi5.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        d();
        Object obj2 = this.u.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof f01)) {
            return new String((byte[]) obj2, zi5.a);
        }
        f01 f01Var = (f01) obj2;
        return f01Var.size() == 0 ? BuildConfig.FLAVOR : f01Var.l(zi5.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.u.size();
    }

    public g26(ArrayList<Object> arrayList) {
        super(true);
        this.u = arrayList;
    }

    public g26(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    @Override // defpackage.m2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(this.u.size(), collection);
    }
}
