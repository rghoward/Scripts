package io.ably.lib.http;

import com.intercom.twig.BuildConfig;
import defpackage.bl2;
import defpackage.op3;
import defpackage.sk0;
import defpackage.ux1;
import io.ably.lib.types.AblyException;
import io.ably.lib.util.Base64Coder;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class HttpAuth {
    private static final String HEX_LOOKUP = "0123456789abcdef";
    private static MessageDigest md5;
    private String HA1;
    private int ncCounter = 1;
    private String nonce;
    private String opaque;
    private final String password;
    private final Type prefType;
    private String[] qops;
    private String realm;
    private Type type;
    private final String username;

    /* JADX INFO: renamed from: io.ably.lib.http.HttpAuth$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$ably$lib$http$HttpAuth$Type;

        static {
            int[] iArr = new int[Type.values().length];
            $SwitchMap$io$ably$lib$http$HttpAuth$Type = iArr;
            try {
                iArr[Type.BASIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$ably$lib$http$HttpAuth$Type[Type.DIGEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public enum Type {
        BASIC,
        DIGEST,
        X_ABLY_TOKEN;

        public static Type parse(String str) {
            String strReplace = str.toUpperCase(Locale.ROOT).replace('-', '_');
            try {
                return valueOf(strReplace);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(op3.a("Failed to parse conformed form '", strReplace, "' of raw value '", str, "'."), e);
            }
        }
    }

    static {
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused) {
        }
    }

    public HttpAuth(String str, String str2, Type type) {
        this.username = str;
        this.password = str2;
        this.prefType = type;
    }

    private static String bytesToHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            sb.append(HEX_LOOKUP.charAt((bArr[i] & 240) >> 4));
            sb.append(HEX_LOOKUP.charAt(bArr[i] & 15));
        }
        return sb.toString();
    }

    private static String digestBytes(byte[] bArr) {
        md5.reset();
        md5.update(bArr);
        return bytesToHexString(md5.digest());
    }

    private static String digestString(String str) {
        try {
            return digestBytes(str.getBytes("ISO-8859-1"));
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    private static String getClientNonce() {
        String str = new SimpleDateFormat("yyyy:MM:dd:hh:mm:ss").format(new Date());
        Integer numValueOf = Integer.valueOf(new Random(100000L).nextInt());
        StringBuilder sbA = bl2.a(str);
        sbA.append(numValueOf.toString());
        return digestString(sbA.toString()).substring(0, 8);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[LOOP:0: B:5:0x0009->B:14:0x0028, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0026 A[SYNTHETIC] */
    private String getDigestHeader(String str, String str2, byte[] bArr) {
        String str3;
        String strDigestString;
        String clientNonce;
        String[] strArr = this.qops;
        String str4 = null;
        if (strArr == null) {
            str3 = null;
            break;
        }
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                str3 = null;
                break;
            }
            String str5 = strArr[i];
            if (bArr != null) {
                str3 = "auth-int";
                if (str5.trim().equals("auth-int")) {
                    break;
                }
                if (str5.trim().equals("auth")) {
                    str3 = "auth";
                    break;
                }
                i++;
            } else {
                if (str5.trim().equals("auth")) {
                    str3 = "auth";
                    break;
                }
                i++;
            }
        }
        if (str3 == null) {
            strDigestString = digestString(this.HA1 + ':' + this.nonce + ':' + digestString(str + ':' + str2));
            clientNonce = null;
        } else {
            boolean zEquals = str3.equals("auth");
            int i2 = this.ncCounter;
            if (zEquals) {
                this.ncCounter = i2 + 1;
                str4 = String.format("%08X", Integer.valueOf(i2));
                clientNonce = getClientNonce();
                strDigestString = digestString(this.HA1 + ':' + this.nonce + ':' + str4 + ':' + clientNonce + ':' + str3 + ':' + digestString(str + ':' + str2));
            } else {
                this.ncCounter = i2 + 1;
                str4 = String.format("%08X", Integer.valueOf(i2));
                String clientNonce2 = getClientNonce();
                strDigestString = digestString(this.HA1 + ':' + this.nonce + ':' + str4 + ':' + clientNonce2 + ':' + str3 + ':' + digestString(str + ':' + str2 + ':' + digestBytes(bArr)));
                clientNonce = clientNonce2;
            }
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("Digest username=\"");
        sb.append(this.username);
        sb.append("\",realm=\"");
        sb.append(this.realm);
        sb.append("\",nonce=\"");
        ux1.b(sb, this.nonce, "\",uri=\"", str2, "\",algorithm=\"MD5\",");
        if (str3 != null) {
            ux1.b(sb, "qop=\"", str3, "\",nc=", str4);
            sb.append(",cnonce=\"");
            sb.append(clientNonce);
            sb.append("\",");
        }
        if (this.opaque != null) {
            sb.append("response=\"");
            sb.append(strDigestString);
            sb.append("\",opaque=\"");
            sb.append(this.opaque);
            sb.append("\"");
        } else {
            sb.append("response=\"");
            sb.append(strDigestString);
            sb.append("\"");
        }
        return sb.toString();
    }

    private synchronized void processDigestHeader(String str) {
        HashMap<String, String> mapSplitAuthFields = splitAuthFields(str);
        this.realm = mapSplitAuthFields.get("realm");
        this.nonce = mapSplitAuthFields.get("nonce");
        this.opaque = mapSplitAuthFields.get("opaque");
        this.HA1 = digestString(this.username + ':' + this.realm + ':' + this.password);
        String str2 = mapSplitAuthFields.get("qop");
        if (str2 != null) {
            this.qops = str2.split(",");
        }
    }

    public static Map<Type, String> sortAuthenticateHeaders(Collection<String> collection) throws AblyException {
        HashMap map = new HashMap();
        for (String str : collection) {
            int iIndexOf = str.indexOf(32);
            if (iIndexOf == -1) {
                throw sk0.b(40000, CarouselScreenFragment.CAROUSEL_ANIMATION_MS, "Invalid authenticate header (no delimiter)");
            }
            String strTrim = str.substring(0, iIndexOf).trim();
            map.put(Type.parse(strTrim), str.substring(iIndexOf + 1).trim());
        }
        return map;
    }

    private static HashMap<String, String> splitAuthFields(String str) {
        HashMap<String, String> map = new HashMap<>();
        for (String str2 : str.split(",")) {
            if (str2.contains("=")) {
                map.put(str2.substring(0, str2.indexOf("=")).trim(), str2.substring(str2.indexOf("=") + 1).replaceAll("\"", BuildConfig.FLAVOR).trim());
            }
        }
        return map;
    }

    public String getAuthorizationHeader(String str, String str2, byte[] bArr) {
        int i = AnonymousClass1.$SwitchMap$io$ably$lib$http$HttpAuth$Type[this.type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return getDigestHeader(str, str2, bArr);
        }
        return "Basic " + Base64Coder.encodeString(this.username + ':' + this.password);
    }

    public boolean hasChallenge() {
        return this.type != null;
    }

    public void processAuthenticateHeaders(Map<Type, String> map) throws AblyException {
        Type type = this.prefType;
        this.type = type;
        String value = map.get(type);
        if (value == null) {
            Map.Entry<Type, String> next = map.entrySet().iterator().next();
            if (next == null) {
                throw sk0.b(40000, CarouselScreenFragment.CAROUSEL_ANIMATION_MS, "Invalid authenticate header (no entries)");
            }
            this.type = next.getKey();
            value = next.getValue();
        }
        if (this.type == Type.DIGEST) {
            processDigestHeader(value);
        }
    }
}
