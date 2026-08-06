package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mt8 implements ye2, xe2.a<Object> {
    public volatile kx6.a<?> A;
    public File B;
    public nt8 C;
    public final gn2 t;
    public final en2<?> u;
    public int v;
    public int w = -1;
    public ko5 x;
    public List<kx6<File, ?>> y;
    public int z;

    public mt8(en2 en2Var, gn2 gn2Var) {
        this.u = en2Var;
        this.t = gn2Var;
    }

    @Override // defpackage.ye2
    public final boolean a() {
        List<Class<?>> list;
        boolean z;
        List list2;
        boolean z2;
        ArrayList arrayListC;
        ArrayList arrayListA = this.u.a();
        if (arrayListA.isEmpty()) {
            return false;
        }
        en2<?> en2Var = this.u;
        sl8 sl8VarA = en2Var.c.a();
        Class<?> cls = en2Var.d.getClass();
        Class<?> cls2 = en2Var.g;
        Class<?> cls3 = en2Var.k;
        nx6 nx6Var = sl8VarA.h;
        e07 andSet = nx6Var.a.getAndSet(null);
        if (andSet == null) {
            andSet = new e07(cls, cls2, cls3);
        } else {
            andSet.a = cls;
            andSet.b = cls2;
            andSet.c = cls3;
        }
        synchronized (nx6Var.b) {
            list = nx6Var.b.get(andSet);
        }
        nx6Var.a.set(andSet);
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            mx6 mx6Var = sl8VarA.a;
            synchronized (mx6Var) {
                arrayListC = mx6Var.a.c(cls);
            }
            int size = arrayListC.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListC.get(i);
                i++;
                ArrayList arrayListB = sl8VarA.c.b((Class) obj, cls2);
                int size2 = arrayListB.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayListB.get(i2);
                    i2++;
                    Class cls4 = (Class) obj2;
                    if (!sl8VarA.f.a(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            z = false;
            nx6 nx6Var2 = sl8VarA.h;
            List<Class<?>> listUnmodifiableList = Collections.unmodifiableList(arrayList);
            synchronized (nx6Var2.b) {
                nx6Var2.b.put(new e07(cls, cls2, cls3), listUnmodifiableList);
            }
            list2 = arrayList;
        } else {
            z = false;
            list2 = list;
        }
        if (list2.isEmpty()) {
            if (File.class.equals(this.u.k)) {
                return z;
            }
            StringBuilder sb = new StringBuilder("Failed to find any load path from ");
            sb.append(this.u.d.getClass());
            Class<?> cls5 = this.u.k;
            sb.append(" to ");
            sb.append(cls5);
            throw new IllegalStateException(sb.toString());
        }
        while (true) {
            List<kx6<File, ?>> list3 = this.y;
            if (list3 != null && this.z < list3.size()) {
                this.A = null;
                boolean z3 = z;
                while (!z3 && this.z < this.y.size()) {
                    List<kx6<File, ?>> list4 = this.y;
                    int i3 = this.z;
                    this.z = i3 + 1;
                    kx6<File, ?> kx6Var = list4.get(i3);
                    File file = this.B;
                    en2<?> en2Var2 = this.u;
                    this.A = kx6Var.a(file, en2Var2.e, en2Var2.f, en2Var2.i);
                    if (this.A != null && this.u.c(this.A.c.a()) != null) {
                        this.A.c.c(this.u.o, this);
                        z3 = true;
                    }
                }
                return z3;
            }
            int i4 = this.w + 1;
            this.w = i4;
            if (i4 >= list2.size()) {
                int i5 = this.v + 1;
                this.v = i5;
                if (i5 >= arrayListA.size()) {
                    return z;
                }
                this.w = z ? 1 : 0;
            }
            ko5 ko5Var = (ko5) arrayListA.get(this.v);
            Class cls6 = (Class) list2.get(this.w);
            dva<Z> dvaVarE = this.u.e(cls6);
            en2<?> en2Var3 = this.u;
            this.C = new nt8(en2Var3.c.a, ko5Var, en2Var3.n, en2Var3.e, en2Var3.f, dvaVarE, cls6, en2Var3.i);
            File fileB = ((hg3.c) en2Var3.h).a().b(this.C);
            this.B = fileB;
            if (fileB != null) {
                this.x = ko5Var;
                this.y = this.u.c.a().f(fileB);
                z2 = false;
                this.z = 0;
            } else {
                z2 = false;
            }
            z = z2;
        }
    }

    @Override // defpackage.ye2
    public final void cancel() {
        kx6.a<?> aVar = this.A;
        if (aVar != null) {
            aVar.c.cancel();
        }
    }

    @Override // xe2.a
    public final void d(Exception exc) {
        this.t.e(this.C, exc, this.A.c, kf2.w);
    }

    @Override // xe2.a
    public final void e(Object obj) {
        this.t.f(this.x, obj, this.A.c, kf2.w, this.C);
    }
}
