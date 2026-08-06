package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fe3 implements as2 {
    public final /* synthetic */ s66 t;

    public fe3(EmojiCompatInitializer emojiCompatInitializer, s66 s66Var) {
        this.t = s66Var;
    }

    @Override // defpackage.as2
    public final void E(m76 m76Var) {
        (Build.VERSION.SDK_INT >= 28 ? xu1.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new EmojiCompatInitializer.c(), 500L);
        this.t.c(this);
    }
}
