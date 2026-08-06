package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class h07<Model, Data> implements kx6<Model, Data> {
    public final ArrayList a;
    public final w58<List<Throwable>> b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a<Data> implements xe2<Data>, xe2.a<Data> {
        public final ArrayList t;
        public final w58<List<Throwable>> u;
        public int v;
        public p98 w;
        public xe2.a<? super Data> x;
        public List<Throwable> y;
        public boolean z;

        public a(ArrayList arrayList, w58 w58Var) {
            this.u = w58Var;
            if (arrayList.isEmpty()) {
                z90.a("Must not be empty.");
                throw null;
            }
            this.t = arrayList;
            this.v = 0;
        }

        @Override // defpackage.xe2
        public final Class<Data> a() {
            return ((xe2) this.t.get(0)).a();
        }

        @Override // defpackage.xe2
        public final void b() {
            List<Throwable> list = this.y;
            if (list != null) {
                this.u.a(list);
            }
            this.y = null;
            ArrayList arrayList = this.t;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((xe2) obj).b();
            }
        }

        @Override // defpackage.xe2
        public final void c(p98 p98Var, xe2.a<? super Data> aVar) {
            this.w = p98Var;
            this.x = aVar;
            this.y = this.u.b();
            ((xe2) this.t.get(this.v)).c(p98Var, this);
            if (this.z) {
                cancel();
            }
        }

        @Override // defpackage.xe2
        public final void cancel() {
            this.z = true;
            ArrayList arrayList = this.t;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((xe2) obj).cancel();
            }
        }

        @Override // xe2.a
        public final void d(Exception exc) {
            List<Throwable> list = this.y;
            ov9.d(list, "Argument must not be null");
            list.add(exc);
            f();
        }

        @Override // xe2.a
        public final void e(Data data) {
            if (data != null) {
                this.x.e(data);
            } else {
                f();
            }
        }

        public final void f() {
            if (this.z) {
                return;
            }
            if (this.v < this.t.size() - 1) {
                this.v++;
                c(this.w, this.x);
            } else {
                ov9.c(this.y);
                this.x.d(new rm4("Fetch failed", new ArrayList(this.y)));
            }
        }

        @Override // defpackage.xe2
        public final kf2 getDataSource() {
            return ((xe2) this.t.get(0)).getDataSource();
        }
    }

    public h07(ArrayList arrayList, at3.c cVar) {
        this.a = arrayList;
        this.b = cVar;
    }

    @Override // defpackage.kx6
    public final kx6.a<Data> a(Model model, int i, int i2, xk7 xk7Var) {
        kx6.a<Data> aVarA;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        ko5 ko5Var = null;
        for (int i3 = 0; i3 < size; i3++) {
            kx6 kx6Var = (kx6) arrayList.get(i3);
            if (kx6Var.b(model) && (aVarA = kx6Var.a(model, i, i2, xk7Var)) != null) {
                ko5Var = aVarA.a;
                arrayList2.add(aVarA.c);
            }
        }
        if (arrayList2.isEmpty() || ko5Var == null) {
            return null;
        }
        return new kx6.a<>(ko5Var, new a(arrayList2, this.b));
    }

    @Override // defpackage.kx6
    public final boolean b(Model model) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((kx6) obj).b(model)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.a.toArray()) + '}';
    }
}
