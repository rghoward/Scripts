package defpackage;

import com.hwpo_training_app.core.data.model.schedule.BenchmarkNetworkEntity;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface rr8 {
    @ui4("benchmarks/required")
    Object a(r02<? super List<BenchmarkNetworkEntity>> r02Var);

    @wn7("benchmarks/{id}")
    @gd4
    Object b(@eu7("id") int i, @nu3("value") String str, @nu3("units") String str2, r02<? super BenchmarkNetworkEntity> r02Var);
}
