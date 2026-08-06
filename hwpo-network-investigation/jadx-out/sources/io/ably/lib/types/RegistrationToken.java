package io.ably.lib.types;

import defpackage.av;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class RegistrationToken {
    public String token;
    public Type type;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public enum Type {
        GCM,
        FCM;

        public static Type fromName(String str) {
            try {
                return valueOf(str.toUpperCase(Locale.ROOT));
            } catch (Throwable unused) {
                return null;
            }
        }

        public static Type fromOrdinal(int i) {
            try {
                return values()[i];
            } catch (Throwable unused) {
                return null;
            }
        }

        public String toName() {
            return name().toLowerCase(Locale.ROOT);
        }
    }

    public RegistrationToken(Type type, String str) {
        this.type = type;
        this.token = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RegistrationToken{type=");
        sb.append(this.type);
        sb.append(", token='");
        return av.a(sb, this.token, "'}");
    }
}
