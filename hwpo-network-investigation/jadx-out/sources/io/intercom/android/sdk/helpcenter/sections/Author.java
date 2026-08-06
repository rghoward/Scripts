package io.intercom.android.sdk.helpcenter.sections;

import com.intercom.twig.BuildConfig;
import defpackage.hl3;
import defpackage.qq2;
import defpackage.rd9;
import defpackage.ru3;
import defpackage.sd9;
import defpackage.st1;
import defpackage.xj5;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@rd9
public final class Author {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Avatar avatar;
    private final String id;
    private final String name;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ Author(int i, String str, String str2, Avatar avatar, sd9 sd9Var) {
        String str3 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (1 != (i & 1)) {
            hl3.b(i, 1, Author$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        if ((i & 2) == 0) {
            this.name = BuildConfig.FLAVOR;
        } else {
            this.name = str2;
        }
        if ((i & 4) != 0) {
            this.avatar = avatar;
        } else {
            this.avatar = new Avatar(str3, (String) (objArr2 == true ? 1 : 0), 3, (qq2) (objArr == true ? 1 : 0));
        }
    }

    public static /* synthetic */ Author copy$default(Author author, String str, String str2, Avatar avatar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = author.id;
        }
        if ((i & 2) != 0) {
            str2 = author.name;
        }
        if ((i & 4) != 0) {
            avatar = author.avatar;
        }
        return author.copy(str, str2, avatar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ void write$Self$intercom_sdk_base_release(Author author, st1 st1Var, SerialDescriptor serialDescriptor) {
        st1Var.p(serialDescriptor, 0, author.id);
        if (st1Var.C(serialDescriptor) || !xj5.a(author.name, BuildConfig.FLAVOR)) {
            st1Var.p(serialDescriptor, 1, author.name);
        }
        if (!st1Var.C(serialDescriptor)) {
            if (xj5.a(author.avatar, new Avatar((String) null, (String) (0 == true ? 1 : 0), 3, (qq2) (0 == true ? 1 : 0)))) {
                return;
            }
        }
        st1Var.q(serialDescriptor, 2, Avatar$$serializer.INSTANCE, author.avatar);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final Avatar component3() {
        return this.avatar;
    }

    public final Author copy(String str, String str2, Avatar avatar) {
        str.getClass();
        str2.getClass();
        avatar.getClass();
        return new Author(str, str2, avatar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Author)) {
            return false;
        }
        Author author = (Author) obj;
        return xj5.a(this.id, author.id) && xj5.a(this.name, author.name) && xj5.a(this.avatar, author.avatar);
    }

    public final Avatar getAvatar() {
        return this.avatar;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.avatar.hashCode() + ru3.c(this.id.hashCode() * 31, 31, this.name);
    }

    public String toString() {
        return "Author(id=" + this.id + ", name=" + this.name + ", avatar=" + this.avatar + ')';
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<Author> serializer() {
            return Author$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }
    }

    public static /* synthetic */ void getAvatar$annotations() {
    }

    public static /* synthetic */ void getId$annotations() {
    }

    public static /* synthetic */ void getName$annotations() {
    }

    public Author(String str, String str2, Avatar avatar) {
        str.getClass();
        str2.getClass();
        avatar.getClass();
        this.id = str;
        this.name = str2;
        this.avatar = avatar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ Author(String str, String str2, Avatar avatar, int i, qq2 qq2Var) {
        this(str, (i & 2) != 0 ? BuildConfig.FLAVOR : str2, (i & 4) != 0 ? new Avatar((String) null, (String) (0 == true ? 1 : 0), 3, (qq2) (0 == true ? 1 : 0)) : avatar);
    }
}
