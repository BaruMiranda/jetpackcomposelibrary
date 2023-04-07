
# Jetpack components 🧩

Welcome to jepackcomponents, a library of components for Jetpack Compose!

This library is designed to help you create stunning and consistent user interfaces using the Jetpack Compose framework and Material 3. We offer a variety of ready-to-use components, from buttons to cards and more. All of our components have been carefully designed to follow Material 3 guidelines, so you can be confident that your user interfaces will have a modern and updated look and feel.

Additionally, our components are highly customizable and easy to integrate into your project. You can modify the colors, sizes, and shapes of each component to fit your specific needs.

In summary, jepackcomponents is a powerful and easy-to-use component library that will help you create beautiful and modern user interfaces. Try our components today and enhance the appearance of your Jetpack Compose applications!








## Authors

- [@fraporitmos](https://www.github.com/franespino)



![Logo](https://res.cloudinary.com/frapoteam/image/upload/v1680450986/demo_v6x37v.gif)


## Add Jitpack.io

```bash   
  repositories {
      ...
        maven { url 'https://jitpack.io' }
      ...
  }
```
Install the dependency

```bash
   implementation "com.github.FranEspino:jetpackcomponents:1.0.0"
```

## Installation

Install the dependency

```bash
   implementation "com.github.FranEspino:jetpackcomponents:1.0.0"
```
    
## Usage/Examples

```kotlin
import com.fraporitmos.jetpackcomponents.components.Switch.


@Preview
@Composable
fun SwitchLayout() {

         val (state1, onStateChange1) = rememberSaveable { mutableStateOf(true) }

         SwitchM3(
                modifier = Modifier.padding(top = 2.dp),
                state = state1,
                onStateChange = { onStateChange1(it) }
            )

}
```

## 🛠 Skills
Android, Kotlin, Jetpack Compose


## 🔗 Links
[![portfolio](https://img.shields.io/badge/my_portfolio-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://fraporitmos.com/)
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/franespino)
[![twitter](https://img.shields.io/badge/twitter-1DA1F2?style=for-the-badge&logo=twitter&logoColor=white)](https://twitter.com/fraporitmos)

