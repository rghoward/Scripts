package defpackage;

import android.text.InputFilter;
import android.text.Spanned;
import com.hwpo_training_app.leaderboards.filter.list.presentation.screen.LeaderboardFiltersFragment;
import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r36 implements InputFilter {
    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        LeaderboardFiltersFragment.Companion companion = LeaderboardFiltersFragment.Companion;
        spanned.getClass();
        if (spanned.length() == 0) {
            charSequence.getClass();
            if (z2a.K(charSequence, '0')) {
                char[] cArr = {'0'};
                int length = charSequence.length();
                for (int i5 = 0; i5 < length; i5++) {
                    char cCharAt = charSequence.charAt(i5);
                    int i6 = 0;
                    while (true) {
                        if (i6 >= 1) {
                            i6 = -1;
                            break;
                        }
                        if (cCharAt == cArr[i6]) {
                            break;
                        }
                        i6++;
                    }
                    if (i6 < 0) {
                        return charSequence.subSequence(i5, charSequence.length());
                    }
                }
                return BuildConfig.FLAVOR;
            }
        }
        return charSequence;
    }
}
