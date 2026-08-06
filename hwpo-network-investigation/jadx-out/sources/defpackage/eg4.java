package defpackage;

import androidx.fragment.app.f;
import androidx.fragment.app.l;
import com.google.firebase.perf.metrics.Trace;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class eg4 extends l.m {
    public static final dp f = dp.d();
    public final WeakHashMap<f, Trace> a = new WeakHashMap<>();
    public final oh7 b;
    public final oxa c;
    public final f20 d;
    public final fh4 e;

    public eg4(oh7 oh7Var, oxa oxaVar, f20 f20Var, fh4 fh4Var) {
        this.b = oh7Var;
        this.c = oxaVar;
        this.d = f20Var;
        this.e = fh4Var;
    }

    @Override // androidx.fragment.app.l.m
    public final void a(f fVar) {
        rk7 rk7Var;
        Object[] objArr = {fVar.getClass().getSimpleName()};
        dp dpVar = f;
        dpVar.b("FragmentMonitor %s.onFragmentPaused ", objArr);
        WeakHashMap<f, Trace> weakHashMap = this.a;
        if (!weakHashMap.containsKey(fVar)) {
            dpVar.g("FragmentMonitor: missed a fragment trace from %s", fVar.getClass().getSimpleName());
            return;
        }
        Trace trace = weakHashMap.get(fVar);
        weakHashMap.remove(fVar);
        fh4 fh4Var = this.e;
        HashMap map = fh4Var.c;
        dp dpVar2 = fh4.e;
        if (!fh4Var.d) {
            dpVar2.a("Cannot stop sub-recording because FrameMetricsAggregator is not recording");
            rk7Var = new rk7();
        } else if (map.containsKey(fVar)) {
            eh4 eh4Var = (eh4) map.remove(fVar);
            rk7<eh4> rk7VarA = fh4Var.a();
            if (rk7VarA.b()) {
                eh4 eh4VarA = rk7VarA.a();
                rk7Var = new rk7(new eh4(eh4VarA.a - eh4Var.a, eh4VarA.b - eh4Var.b, eh4VarA.c - eh4Var.c));
            } else {
                dpVar2.b("stopFragment(%s): snapshot() failed", fVar.getClass().getSimpleName());
                rk7Var = new rk7();
            }
        } else {
            dpVar2.b("Sub-recording associated with key %s was not started or does not exist", fVar.getClass().getSimpleName());
            rk7Var = new rk7();
        }
        if (!rk7Var.b()) {
            dpVar.g("onFragmentPaused: recorder failed to trace %s", fVar.getClass().getSimpleName());
        } else {
            a69.a(trace, (eh4) rk7Var.a());
            trace.stop();
        }
    }

    @Override // androidx.fragment.app.l.m
    public final void b(f fVar) {
        f.b("FragmentMonitor %s.onFragmentResumed", fVar.getClass().getSimpleName());
        Trace trace = new Trace("_st_".concat(fVar.getClass().getSimpleName()), this.c, this.b, this.d);
        trace.start();
        trace.putAttribute("Parent_fragment", fVar.getParentFragment() == null ? "No parent" : fVar.getParentFragment().getClass().getSimpleName());
        if (fVar.getActivity() != null) {
            trace.putAttribute("Hosting_activity", fVar.getActivity().getClass().getSimpleName());
        }
        this.a.put(fVar, trace);
        fh4 fh4Var = this.e;
        HashMap map = fh4Var.c;
        dp dpVar = fh4.e;
        if (!fh4Var.d) {
            dpVar.a("Cannot start sub-recording because FrameMetricsAggregator is not recording");
            return;
        }
        if (map.containsKey(fVar)) {
            dpVar.b("Cannot start sub-recording because one is already ongoing with the key %s", fVar.getClass().getSimpleName());
            return;
        }
        rk7<eh4> rk7VarA = fh4Var.a();
        if (rk7VarA.b()) {
            map.put(fVar, rk7VarA.a());
        } else {
            dpVar.b("startFragment(%s): snapshot() failed", fVar.getClass().getSimpleName());
        }
    }
}
