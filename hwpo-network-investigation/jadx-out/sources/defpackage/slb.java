package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class slb extends RecyclerView.e0 {
    public final View u;
    public final pm2 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public slb(View view, RecyclerView.u uVar, ipb ipbVar) {
        super(view);
        uVar.getClass();
        ipbVar.getClass();
        this.u = view;
        pm2 pm2Var = new pm2(new pm2.a());
        pm2Var.d.a(1, new e93(new el2(), new fl2(3), new o7(2, ipbVar), gl2.u));
        this.v = pm2Var;
        xlb xlbVar = new xlb();
        o7a o7aVar = new o7a(new b10(5, this));
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler);
        recyclerView.setAdapter(pm2Var);
        recyclerView.setRecycledViewPool(uVar);
        recyclerView.setItemAnimator(null);
        recyclerView.setLayoutManager((LinearLayoutManager) o7aVar.getValue());
        recyclerView.h(xlbVar);
    }
}
