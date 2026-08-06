package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView.e0;
import com.hwpo_training_app.leaderboards.details.list.presentation.adapter.LeaderboardDetailsAthletesAdapter;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t<T, VH extends RecyclerView.e0> extends RecyclerView.f<VH> {
    public final e<T> d;

    public t(LeaderboardDetailsAthletesAdapter.AthleteResultDiffCallback athleteResultDiffCallback) {
        a aVar = new a();
        b bVar = new b(this);
        synchronized (c.a.a) {
            try {
                if (c.a.b == null) {
                    c.a.b = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        e<T> eVar = new e<>(bVar, new c(c.a.b, athleteResultDiffCallback));
        this.d = eVar;
        eVar.d.add(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int f() {
        return this.d.f.size();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements e.a<T> {
        @Override // androidx.recyclerview.widget.e.a
        public final void a() {
        }
    }
}
