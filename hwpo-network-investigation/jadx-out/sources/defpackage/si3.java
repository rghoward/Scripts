package defpackage;

import com.google.android.material.textfield.TextInputLayout;
import com.hwpo_training_app.core.widget.benchamrks.BenchmarksTextSectionLayout;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class si3 implements oh4<List<? extends p7b>, g2b> {
    public final /* synthetic */ fi3 t;

    public si3(fi3 fi3Var) {
        this.t = fi3Var;
    }

    @Override // defpackage.oh4
    public final g2b invoke(List<? extends p7b> list) {
        fi3.a aVar = fi3.Companion;
        for (p7b p7bVar : list) {
            BenchmarksTextSectionLayout benchmarksTextSectionLayout = this.t.q().d;
            int iA = p7bVar.a();
            p7b.a aVar2 = p7bVar instanceof p7b.a ? (p7b.a) p7bVar : null;
            String str = aVar2 != null ? aVar2.c : null;
            Integer num = (Integer) benchmarksTextSectionLayout.K.getOrDefault(Integer.valueOf(iA), null);
            if (num != null) {
                ((TextInputLayout) benchmarksTextSectionLayout.findViewById(num.intValue())).setError(str);
            }
        }
        return g2b.a;
    }
}
