package defpackage;

import com.hwpo_training_app.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hp0 implements r54<Boolean> {
    public final /* synthetic */ r54 t;
    public final /* synthetic */ fp0 u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<T> implements s54 {
        public final /* synthetic */ s54 t;
        public final /* synthetic */ fp0 u;

        /* JADX INFO: renamed from: hp0$a$a, reason: collision with other inner class name */
        @xm2(c = "com.hwpo_training_app.benchmarks.presentation.benchmarks.BenchmarksViewModel$observeBenchmarkUpdates$$inlined$map$1$2", f = "BenchmarksViewModel.kt", l = {217}, m = "emit", v = 2)
        public static final class C0103a extends u02 {
            public /* synthetic */ Object t;
            public int u;

            public C0103a(r02 r02Var) {
                super(r02Var);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) {
                this.t = obj;
                this.u |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(s54 s54Var, fp0 fp0Var) {
            this.t = s54Var;
            this.u = fp0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.s54
        public final Object emit(Object obj, r02 r02Var) throws Throwable {
            C0103a c0103a;
            boolean z;
            Object obj2;
            if (r02Var instanceof C0103a) {
                c0103a = (C0103a) r02Var;
                int i = c0103a.u;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0103a.u = i - Integer.MIN_VALUE;
                } else {
                    c0103a = new C0103a(r02Var);
                }
            } else {
                c0103a = new C0103a(r02Var);
            }
            Object obj3 = c0103a.t;
            int i2 = c0103a.u;
            if (i2 == 0) {
                dv8.b(obj3);
                HashMap map = (HashMap) obj;
                int i3 = fp0.K;
                fp0 fp0Var = this.u;
                List<vn0> list = fp0Var.b().b;
                List<vn0> list2 = fp0Var.b().b;
                ArrayList arrayList = new ArrayList(ph1.n(list2, 10));
                for (vn0 vn0Var : list2) {
                    xn0 xn0Var = vn0Var.z;
                    int i4 = vn0Var.t;
                    arrayList.add((xn0Var != xn0.u || vn0Var.y == m2b.u) ? new hc7(i4, fp0Var.G.b(R.string.zero_value_validtion_error, new Object[0]), true) : new vma(i4, true));
                }
                ArrayList arrayListF = wn0.f(map, list, arrayList);
                if (arrayListF.isEmpty()) {
                    z = true;
                    break;
                }
                int size = arrayListF.size();
                z = false;
                int i5 = 0;
                do {
                    if (i5 >= size) {
                        z = true;
                        break;
                    }
                    obj2 = arrayListF.get(i5);
                    i5++;
                } while (((p7b) obj2) instanceof p7b.b);
                Boolean boolValueOf = Boolean.valueOf(z);
                c0103a.u = 1;
                Object objEmit = this.t.emit(boolValueOf, c0103a);
                v72 v72Var = v72.t;
                if (objEmit == v72Var) {
                    return v72Var;
                }
            } else {
                if (i2 != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj3);
            }
            return g2b.a;
        }
    }

    public hp0(r54 r54Var, fp0 fp0Var) {
        this.t = r54Var;
        this.u = fp0Var;
    }

    @Override // defpackage.r54
    public final Object collect(s54<? super Boolean> s54Var, r02 r02Var) {
        Object objCollect = this.t.collect(new a(s54Var, this.u), r02Var);
        return objCollect == v72.t ? objCollect : g2b.a;
    }
}
