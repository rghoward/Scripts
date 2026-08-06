package defpackage;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.PopupMenu;
import androidx.fragment.app.g;
import androidx.fragment.app.l;
import com.hwpo_training_app.R;
import com.hwpo_training_app.leaderboards.filter.list.presentation.flow.LeaderboardFiltersFlowFragment;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qb3 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ qb3(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                rb3 rb3Var = (rb3) obj;
                kx3.b bVar = rb3Var.B;
                if (bVar == null) {
                    xj5.e("filePickerFactory");
                    throw null;
                }
                ba activityResultRegistry = rb3Var.requireActivity().getActivityResultRegistry();
                activityResultRegistry.getClass();
                s66 lifecycle = rb3Var.getLifecycle();
                lifecycle.getClass();
                return bVar.a(activityResultRegistry, lifecycle);
            case 1:
                LeaderboardFiltersFlowFragment leaderboardFiltersFlowFragment = (LeaderboardFiltersFlowFragment) obj;
                LeaderboardFiltersFlowFragment.Companion companion = LeaderboardFiltersFlowFragment.Companion;
                g gVarRequireActivity = leaderboardFiltersFlowFragment.requireActivity();
                gVarRequireActivity.getClass();
                int i2 = leaderboardFiltersFlowFragment.Q;
                l childFragmentManager = leaderboardFiltersFlowFragment.getChildFragmentManager();
                childFragmentManager.getClass();
                return new y10(gVarRequireActivity, i2, childFragmentManager);
            case 2:
                final vo6 vo6Var = (vo6) obj;
                vo6.a aVar = vo6.Companion;
                final PopupMenu popupMenu = new PopupMenu(vo6Var.requireContext(), vo6Var.v().f);
                popupMenu.inflate(R.menu.menu_filter_options);
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: uo6
                    @Override // android.widget.PopupMenu.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        sn6 sn6Var;
                        vo6.a aVar2 = vo6.Companion;
                        boolean z = !menuItem.isChecked();
                        PopupMenu popupMenu2 = popupMenu;
                        Menu menu = popupMenu2.getMenu();
                        menu.getClass();
                        int size = menu.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            Menu menu2 = popupMenu2.getMenu();
                            menu2.getClass();
                            menu2.getItem(i3).setChecked(false);
                        }
                        menuItem.setChecked(z);
                        int itemId = menuItem.getItemId();
                        if (itemId == R.id.filterPhotos) {
                            sn6Var = sn6.t;
                        } else if (itemId == R.id.filterVideos) {
                            sn6Var = sn6.u;
                        } else if (itemId == R.id.filterYoutube) {
                            sn6Var = sn6.v;
                        } else {
                            if (itemId != R.id.filterFiles) {
                                z90.a("Unknown filter option");
                                return false;
                            }
                            sn6Var = sn6.w;
                        }
                        ip6 ip6VarW = vo6Var.w();
                        if (!menuItem.isChecked()) {
                            sn6Var = null;
                        }
                        ip6VarW.e(new ip6.a.c(sn6Var, ip6VarW.g(sn6Var)));
                        ip6VarW.i();
                        return true;
                    }
                });
                return popupMenu;
            default:
                oo7.b<Object> bVar2 = oo7.b.g;
                return oo7.b.a.a(ws0.h(new cva(0, (List) obj)), 0, 0, vb6.d, null);
        }
    }
}
