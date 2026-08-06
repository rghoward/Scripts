package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.navigation.compose.NavHostKt$NavHost$33$1", f = "NavHost.kt", l = {}, m = "invokeSuspend")
public final class f77 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public final /* synthetic */ tva<r47> t;
    public final /* synthetic */ o67 u;
    public final /* synthetic */ r47 v;
    public final /* synthetic */ r27<String> w;
    public final /* synthetic */ yz9<List<r47>> x;
    public final /* synthetic */ js1 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f77(tva<r47> tvaVar, o67 o67Var, r47 r47Var, r27<String> r27Var, yz9<? extends List<r47>> yz9Var, js1 js1Var, r02<? super f77> r02Var) {
        super(2, r02Var);
        this.t = tvaVar;
        this.u = o67Var;
        this.v = r47Var;
        this.w = r27Var;
        this.x = yz9Var;
        this.y = js1Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new f77(this.t, this.u, this.v, this.w, this.x, this.y, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((f77) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x00d7 A[LOOP:1: B:15:0x005f->B:27:0x00d7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x00da A[EDGE_INSN: B:32:0x00da->B:28:0x00da BREAK  A[LOOP:1: B:15:0x005f->B:27:0x00d7], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        tva<r47> tvaVar = this.t;
        Object objB = tvaVar.a.b();
        dt7 dt7Var = tvaVar.d;
        if (xj5.a(objB, dt7Var.getValue()) && (this.u.b.f.l() == null || xj5.a(dt7Var.getValue(), this.v))) {
            Iterator<T> it = this.x.getValue().iterator();
            while (it.hasNext()) {
                this.y.b().b((r47) it.next());
            }
            r27<String> r27Var = this.w;
            long[] jArr = r27Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((j & 255) < 128) {
                                int i4 = (i << 3) + i3;
                                Object obj2 = r27Var.b[i4];
                                float f = r27Var.c[i4];
                                if (!xj5.a((String) obj2, ((r47) dt7Var.getValue()).y)) {
                                    r27Var.e--;
                                    long[] jArr2 = r27Var.a;
                                    int i5 = r27Var.d;
                                    int i6 = i4 >> 3;
                                    int i7 = (i4 & 7) << 3;
                                    long j2 = (jArr2[i6] & (~(255 << i7))) | (254 << i7);
                                    jArr2[i6] = j2;
                                    jArr2[(((i4 - 7) & i5) + (i5 & 7)) >> 3] = j2;
                                    r27Var.b[i4] = null;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                        if (i != length) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return g2b.a;
    }
}
