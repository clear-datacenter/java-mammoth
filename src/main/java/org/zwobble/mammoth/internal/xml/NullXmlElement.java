package org.zwobble.mammoth.internal.xml;

import java.util.Optional;

public class NullXmlElement implements XmlElementLike {
    public static final XmlElementLike INSTANCE = new NullXmlElement();

    private NullXmlElement() {
    }

    @Override
    public boolean hasChild(String name) {
        return false;
    }

    @Override
    public XmlElementLike findChildOrEmpty(String name) {
        return this;
    }

    @Override
    public Optional<String> getAttributeOrNone(String name) {
        return Optional.empty();
    }
}
