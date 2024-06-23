package com.sfd.command;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * TODO: FILL OUT
 *
 * @author Stephen Dumas - Initial Creation
 */
public class CommandClassTest {

    @Test
    public void validateAllValuesAreUnique() {
        Assertions.assertThat(Arrays.stream(CommandClass.values())
                .collect(Collectors.groupingBy(CommandClass::getValue)).entrySet().stream()
                .filter(stringListEntry -> stringListEntry.getValue().size() > 1))
                .isEmpty();

    }

}
