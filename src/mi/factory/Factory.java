package mi.factory;

import mi.Container.Container;

public interface Factory
{
    Container createContainer(Strategy startegy);
}