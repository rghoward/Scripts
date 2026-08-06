package defpackage;

import android.os.Bundle;
import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class dtb extends x2 {
    public final /* synthetic */ btb a;
    public final /* synthetic */ etb b;

    public dtb(btb btbVar, etb etbVar) {
        this.a = btbVar;
        this.b = etbVar;
    }

    @Override // defpackage.x2, defpackage.fsb
    public final void b(rrb rrbVar) {
        String string;
        rrbVar.getClass();
        Bundle arguments = this.a.getArguments();
        if (arguments == null || (string = arguments.getString("com.hwpo_training_app.youtube_player.dialog.YoutubePlayerFragment.VIDEO_ID_KEY")) == null) {
            string = BuildConfig.FLAVOR;
        }
        rrbVar.f(string, 0.0f);
        this.b.c.setVisibility(8);
    }
}
