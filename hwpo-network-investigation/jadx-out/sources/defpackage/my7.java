package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.country.presentation.PickCountryViewModel$loadCountries$1", f = "PickCountryViewModel.kt", l = {68}, m = "invokeSuspend", v = 2)
public final class my7 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ ny7 u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a extends pi4 implements oh4<List<? extends l82>, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(List<? extends l82> list) {
            boolean z;
            List<? extends l82> list2 = list;
            list2.getClass();
            ny7 ny7Var = (ny7) this.receiver;
            int i = ny7.C;
            ny7Var.getClass();
            ArrayList arrayList = new ArrayList(ph1.n(list2, 10));
            Iterator<T> it = list2.iterator();
            while (true) {
                z = false;
                if (!it.hasNext()) {
                    break;
                }
                l82 l82Var = (l82) it.next();
                arrayList.add(new m82(l82Var.a, l82Var.b, false));
            }
            m82 m82Var = ny7Var.b().c;
            if (m82Var != null) {
                arrayList = ny7.g(m82Var.a, arrayList);
            }
            ny7Var.e(new cy7.a(arrayList));
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    if (((m82) obj).c) {
                        z = true;
                        break;
                    }
                }
            }
            ny7Var.e(new cy7.e(z));
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class b extends pi4 implements oh4<Exception, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(Exception exc) {
            Exception exc2 = exc;
            exc2.getClass();
            ny7 ny7Var = (ny7) this.receiver;
            int i = ny7.C;
            ny7Var.getClass();
            rma.a.b(exc2);
            ny7Var.e(cy7.b.a);
            ny7Var.f(new jy7(ny7Var.y.a(exc2)));
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public my7(ny7 ny7Var, r02<? super my7> r02Var) {
        super(2, r02Var);
        this.u = ny7Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new my7(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((my7) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        ny7 ny7Var = this.u;
        if (i == 0) {
            dv8.b(obj);
            sk4 sk4Var = ny7Var.x;
            g2b g2bVar = g2b.a;
            this.t = 1;
            sk4Var.getClass();
            obj = g5b.b(sk4Var, g2bVar, this);
            v72 v72Var = v72.t;
            if (obj == v72Var) {
                return v72Var;
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        ((xd3) obj).a(new a(1, ny7Var, ny7.class, "onCountriesLoaded", "onCountriesLoaded(Ljava/util/List;)V", 0), new b(1, ny7Var, ny7.class, "onError", "onError(Ljava/lang/Exception;)V", 0));
        return g2b.a;
    }
}
