package defpackage;

import com.google.firebase.perf.metrics.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class asa {
    public final Trace a;

    public asa(Trace trace) {
        this.a = trace;
    }

    public final zra a() {
        List listUnmodifiableList;
        zra.a aVarR = zra.R();
        aVarR.s(this.a.w);
        aVarR.q(this.a.D.t);
        Trace trace = this.a;
        aVarR.r(trace.D.b(trace.E));
        for (b82 b82Var : this.a.x.values()) {
            aVarR.p(b82Var.u.get(), b82Var.t);
        }
        ArrayList arrayList = this.a.A;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                aVarR.o(new asa((Trace) obj).a());
            }
        }
        Map<String, String> attributes = this.a.getAttributes();
        aVarR.n();
        zra.C((zra) aVarR.u).putAll(attributes);
        Trace trace2 = this.a;
        synchronized (trace2.z) {
            try {
                ArrayList arrayList2 = new ArrayList();
                for (hv7 hv7Var : trace2.z) {
                    if (hv7Var != null) {
                        arrayList2.add(hv7Var);
                    }
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList2);
            } catch (Throwable th) {
                throw th;
            }
        }
        iv7[] iv7VarArrB = hv7.b(listUnmodifiableList);
        if (iv7VarArrB != null) {
            List listAsList = Arrays.asList(iv7VarArrB);
            aVarR.n();
            zra.E((zra) aVarR.u, listAsList);
        }
        return aVarR.l();
    }
}
