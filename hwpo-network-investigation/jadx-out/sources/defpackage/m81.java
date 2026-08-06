package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import androidx.fragment.app.f;
import com.hwpo_training_app.R;
import com.hwpo_training_app.leaderboards.attachments.presentation.LeaderboardValueAttachmentsEvents;
import com.hwpo_training_app.leaderboards.attachments.presentation.LeaderboardValueAttachmentsFragment;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m81 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ f u;

    public /* synthetic */ m81(f fVar, int i) {
        this.t = i;
        this.u = fVar;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        Context context;
        int i = this.t;
        f fVar = this.u;
        switch (i) {
            case 0:
                o81 o81Var = (o81) fVar;
                gm3 gm3Var = (gm3) obj;
                o81.a aVar = o81.Companion;
                gm3Var.getClass();
                if (gm3Var instanceof w81.b) {
                    o81Var.t(((w81.b) gm3Var).b);
                } else if (gm3Var instanceof w81.a) {
                    o81Var.getParentFragmentManager().e0(uy0.c(new js7("ARG_ACTION_TYPE", Integer.valueOf(((w81.a) gm3Var).b.ordinal()))), "REQUEST_KEY_CHANGE_PASSWORD_DIALOG");
                    o81Var.i();
                }
                break;
            default:
                LeaderboardValueAttachmentsFragment leaderboardValueAttachmentsFragment = (LeaderboardValueAttachmentsFragment) fVar;
                gm3 gm3Var2 = (gm3) obj;
                LeaderboardValueAttachmentsFragment.Companion companion = LeaderboardValueAttachmentsFragment.Companion;
                gm3Var2.getClass();
                if (gm3Var2 instanceof LeaderboardValueAttachmentsEvents.ShowError) {
                    leaderboardValueAttachmentsFragment.m(((LeaderboardValueAttachmentsEvents.ShowError) gm3Var2).b);
                } else if (gm3Var2 instanceof LeaderboardValueAttachmentsEvents.OpenUrl) {
                    Context context2 = leaderboardValueAttachmentsFragment.getContext();
                    if (context2 != null) {
                        yz1.a(context2, ((LeaderboardValueAttachmentsEvents.OpenUrl) gm3Var2).b);
                    }
                } else if (gm3Var2 instanceof atb) {
                    btb.a aVar2 = btb.Companion;
                    String str = ((atb) gm3Var2).b;
                    aVar2.getClass();
                    hk0.l(leaderboardValueAttachmentsFragment, btb.a.a(str));
                } else if ((gm3Var2 instanceof LeaderboardValueAttachmentsEvents.OpenFile) && (context = leaderboardValueAttachmentsFragment.getContext()) != null) {
                    LeaderboardValueAttachmentsEvents.OpenFile openFile = (LeaderboardValueAttachmentsEvents.OpenFile) gm3Var2;
                    File file = openFile.b;
                    String str2 = openFile.c;
                    String str3 = openFile.d;
                    file.getClass();
                    str2.getClass();
                    str3.getClass();
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setFlags(1);
                    intent.setDataAndType(FileProvider.getUriForFile(context, str3.concat(".fileprovider"), file), str2);
                    try {
                        context.startActivity(intent);
                    } catch (ActivityNotFoundException unused) {
                        LeaderboardValueAttachmentsFragment.Companion companion2 = LeaderboardValueAttachmentsFragment.Companion;
                        Toast.makeText(leaderboardValueAttachmentsFragment.requireContext(), leaderboardValueAttachmentsFragment.getResources().getString(R.string.file_can_not_be_open), 0).show();
                        g2b g2bVar = g2b.a;
                    }
                }
                break;
        }
        return g2b.a;
    }
}
