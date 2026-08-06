package defpackage;

import android.app.PictureInPictureUiState;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cz7 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static cz7 a(PictureInPictureUiState pictureInPictureUiState) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 35) {
                pictureInPictureUiState.isStashed();
                pictureInPictureUiState.isTransitioningToPip();
                return new cz7();
            }
            if (i < 31) {
                return new cz7();
            }
            pictureInPictureUiState.isStashed();
            return new cz7();
        }
    }
}
