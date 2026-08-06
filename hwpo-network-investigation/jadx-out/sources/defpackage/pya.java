package defpackage;

import com.intercom.twig.BuildConfig;
import io.ably.lib.util.AgentHeaderCreator;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface pya {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final String a;
        public final byte[] b;

        public a(String str, byte[] bArr) {
            this.a = str;
            this.b = bArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public final String a;
        public final int b;
        public final List<a> c;
        public final byte[] d;

        public b(int i, String str, int i2, ArrayList arrayList, byte[] bArr) {
            this.a = str;
            this.b = i2;
            this.c = arrayList == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList);
            this.d = bArr;
        }

        public final int a() {
            int i = this.b;
            if (i != 2) {
                return i != 3 ? 0 : 512;
            }
            return AudioConstants.AUDIO_FILE_BUFFER_SIZE;
        }
    }

    void a(int i, pt7 pt7Var);

    void b(apa apaVar, ls3 ls3Var, c cVar);

    void c();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c {
        public final String a;
        public final int b;
        public final int c;
        public int d;
        public String e;

        public c(int i, int i2, int i3) {
            String str;
            if (i != Integer.MIN_VALUE) {
                str = i + AgentHeaderCreator.AGENT_DIVIDER;
            } else {
                str = BuildConfig.FLAVOR;
            }
            this.a = str;
            this.b = i2;
            this.c = i3;
            this.d = Integer.MIN_VALUE;
            this.e = BuildConfig.FLAVOR;
        }

        public final void a() {
            int i = this.d;
            this.d = i == Integer.MIN_VALUE ? this.b : i + this.c;
            this.e = this.a + this.d;
        }

        public final void b() {
            if (this.d != Integer.MIN_VALUE) {
                return;
            }
            aa0.c("generateNewId() must be called before retrieving ids.");
        }

        public c(int i, int i2) {
            this(Integer.MIN_VALUE, i, i2);
        }
    }
}
