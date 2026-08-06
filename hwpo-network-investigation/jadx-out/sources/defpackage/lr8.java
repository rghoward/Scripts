package defpackage;

import com.hwpo_training_app.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lr8 implements r54<Boolean> {
    public final /* synthetic */ r54 t;
    public final /* synthetic */ jr8 u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<T> implements s54 {
        public final /* synthetic */ s54 t;
        public final /* synthetic */ jr8 u;

        /* JADX INFO: renamed from: lr8$a$a, reason: collision with other inner class name */
        @xm2(c = "com.hwpo_training_app.client.onboarding_settings.benchmark_input.presentation.RequiredBenchmarkInputViewModel$observeBenchmarkUpdates$$inlined$map$1$2", f = "RequiredBenchmarkInputViewModel.kt", l = {217}, m = "emit", v = 2)
        public static final class C0197a extends u02 {
            public /* synthetic */ Object t;
            public int u;

            public C0197a(r02 r02Var) {
                super(r02Var);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) {
                this.t = obj;
                this.u |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(s54 s54Var, jr8 jr8Var) {
            this.t = s54Var;
            this.u = jr8Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.s54
        public final Object emit(Object obj, r02 r02Var) throws Throwable {
            C0197a c0197a;
            List listI;
            Object obj2;
            Boolean boolValueOf;
            if (r02Var instanceof C0197a) {
                c0197a = (C0197a) r02Var;
                int i = c0197a.u;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0197a.u = i - Integer.MIN_VALUE;
                } else {
                    c0197a = new C0197a(r02Var);
                }
            } else {
                c0197a = new C0197a(r02Var);
            }
            Object obj3 = c0197a.t;
            int i2 = c0197a.u;
            if (i2 == 0) {
                dv8.b(obj3);
                HashMap map = (HashMap) obj;
                jr8.a aVar = jr8.Companion;
                jr8 jr8Var = this.u;
                vn0 vn0Var = jr8Var.b().b;
                if (vn0Var == null) {
                    boolValueOf = Boolean.FALSE;
                } else {
                    vn0 vn0Var2 = jr8Var.b().b;
                    boolean z = false;
                    if (vn0Var2 != null) {
                        int i3 = vn0Var2.t;
                        listI = ws0.i((vn0Var2.z != xn0.u || vn0Var2.y == m2b.u) ? new hc7(i3, jr8Var.z.b(R.string.zero_value_validtion_error, new Object[0]), false) : new vma(i3, false), new zb7(i3));
                    } else {
                        listI = hf3.t;
                    }
                    map.getClass();
                    ArrayList arrayListF = wn0.f(map, ws0.h(vn0Var), listI);
                    if (!arrayListF.isEmpty()) {
                        int size = arrayListF.size();
                        int i4 = 0;
                        do {
                            if (i4 >= size) {
                                z = true;
                                break;
                            }
                            obj2 = arrayListF.get(i4);
                            i4++;
                        } while (((p7b) obj2) instanceof p7b.b);
                    } else {
                        z = true;
                        break;
                    }
                    boolValueOf = Boolean.valueOf(z);
                }
                c0197a.u = 1;
                Object objEmit = this.t.emit(boolValueOf, c0197a);
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

    public lr8(r54 r54Var, jr8 jr8Var) {
        this.t = r54Var;
        this.u = jr8Var;
    }

    @Override // defpackage.r54
    public final Object collect(s54<? super Boolean> s54Var, r02 r02Var) {
        Object objCollect = this.t.collect(new a(s54Var, this.u), r02Var);
        return objCollect == v72.t ? objCollect : g2b.a;
    }
}
